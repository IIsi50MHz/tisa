Ext.onReady(function() {
	r = Ext.get('plan_salu_editor');
	Rozmisteni(r, 20, 20);
});

function Rozmisteni(rootElement, rows, cols) {return {
	root : rootElement,
	rows : rows,
	cols : cols,
	toolbar : null,	
	map : {},
	original_map : {},
	color : 'seat',
	source_class : "plan_salu", 
	
	init : function() {
		if (source = this.root.child("."+this.source_class)) {
				if (source.dom.value!='') {
					this.original_map = Ext.util.JSON.decode(source.dom.value);
					this.map = this.original_map;
  			}
		}
		this.root.dom.innerHTML = this.renderHTML();
		this.mapElement(this.root);
		this.resize(this.rows)
		return this;
	},
	
	mapElement : function(root) {
		this.editor = root.child('.r_editor');
		this.form_output = root.child("."+this.source_class);
		this.editor.on('mousedown', function(e) {
			this.mouseDown = true;
			this.paint(e.target);
		}, this);
		Ext.getBody().on('mouseup', function(e) {
			this.mouseDown = false;
			this.setOutValue();
		}, this);
		this.editor.on('mousemove', function(e) {
			if (this.mouseDown) {
				this.paint(e.target);
			}
		}, this);
		
		this.toolbar = root.child('.r_toolbar');
		this.toolbar.child(".clear").on('click', function(e) {
			if (confirm('Opravdu smazat plochu rozmístění?')) {
				this.map = {}
				this.resize();
			}
		}, this);
		this.toolbar.child(".reset").on('click', function(e) {
			if (confirm('Opravdu obnovit plochu rozmístění?')) {
				this.map = this.original_map;
				this.resize();
			}
		}, this);
		this.toolbar.child(".cols").on('keyup', function(e) {
			this.setCols(e.target.value);
		}, this);
		this.toolbar.child(".rows").on('keyup', function(e) {
			this.setRows(e.target.value);
		}, this);
		colors = this.toolbar.query(".color");
		for (c in colors) {
			//consolee.log(colors[c]);
			if (typeof(colors[c]) != 'function') {
				el = Ext.get(colors[c]);
				//consolee.log(el.on);
				el.on('click', function(e) {
					this.color = e.target.name;
					//consolee.log(this.paint);
				}, this);
			}
		}
	},

	paint : function(seat) {	
		seat = Ext.get(seat);
		pos = seat.dom.id.substr(1, seat.dom.id.length).split('-');
		r = pos[0]; c = pos[1];		
		seat.replaceClass(this.map[r][c], this.color);
		this.map[r][c] = this.color;
	},		
	
	repaint : function() {
		for (r = 0; r < this.rows; r++) {
			for (c = 0; c < this.cols; c++) {
				if (this.map[r][c] != undefined && this.map[r][c] != '') {
					this.editor.child('#p'+r+'-'+c).addClass(this.map[r][c]);
				}
			}
		}
	},
	
	setOutValue : function() {
		map = {};
		for (r = 0; r < this.rows; r++) {
			row = {};
			for (c = 1; c < this.cols; c++) {
				val = this.map[r][c];
				if (val != undefined && val != '') {
					row[c] = val;
				} //else row[c] = ' ';
			}
			if (row != {}) {
				map[r] = row
			}
		}
		this.form_output.dom.innerHTML = Ext.util.JSON.encode(map);
	},
	
	setCols : function (cols) {
		if (this.cols != cols) {
			this.cols = cols;
			this.resize();
		}
	},
	
	setRows : function (rows) {
		if (this.rows != rows) {
			this.rows = rows;
			this.resize();
		}
	},

	resize : function () {
		if (this.rows > 50) this.rows = 50;
		if (this.cols > 50) this.cols = 50;
		s = '';
		for (r = 0; r < this.rows; r++) {
			if (this.map[r] == undefined) {
				this.map[r] = {};
			}
			s+= '<div id="p'+r+'-'+0+'" class="first"></div>';
			for (c = 1; c < this.cols; c++) {
				s+= '<div id="p'+r+'-'+c+'"></div>';
			}
		}
		this.editor.dom.innerHTML = s;
		this.repaint();
		this.setOutValue();
	},
	
	renderHTML : function() {
		s = '<div class="r_toolbar">'+
				'řádků: <input class="rows" type="text" name="rows" size="4" value="'+this.rows+'"/>, '+
				'sloupců: <input class="cols" type="text" name="cols" size="4" value="'+this.cols+'"/>'+
				'<br/>'+
				'<input type="button" class="color" name="seat" value="místo" />'+
				'<input type="button" class="color" name="door" value="dveře" />'+
				'<input type="button" class="color" name="stage" value="plátno/pódium" />'+
				'<input type="button" class="color" name="" value="guma" />'+
				'<br/>'+				
				'<input type="button" class="clear" value="vymazat plochu" />'+
				'<input type="button" class="reset" value="původní plocha" />';
			'</div>';
		s += '<div class="r_editor"></div>';
		s += '<textarea style="display:none" class="'+this.source_class+'" name="'+this.source_class+'"></textarea>';
		return s;
	}
}.init(); }