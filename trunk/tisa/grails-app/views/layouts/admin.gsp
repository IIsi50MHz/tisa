<html>
    <head>
        <title> Tisa Administrace <g:layoutTitle default="" /></title>
        <link rel="stylesheet" href="${createLinkTo(dir:'css',file:'admin.css')}" />
        <link rel="shortcut icon" href="${createLinkTo(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
        <g:layoutHead />
        <g:javascript library="application" />				
    </head>
    <body>
				<span id="user_line">
					Nejsi přihlášen | <g:link controller="front_end"><g:message code="tisa.user.go_front_end"/></g:link>
				</span>
        <div id="spinner" class="spinner" style="display:none;">
            <img src="${createLinkTo(dir:'images',file:'spinner.gif')}" alt="Spinner" />
        </div>	
        <div class="logo">
					<g:link controller="front_end">
						<img style="border:0" src="${createLinkTo(dir:'images',file:'grails_logo.jpg')}" alt="Grails" />
					</g:link>
				</div>	
				
			<div class="nav">
					<span class="menuButton">
							<g:link controller="akce">
									<g:message code="tisa.akce.name.pl"/>
							</g:link>
							<g:link controller="misto">
									<g:message code="tisa.misto.name.pl"/>
							</g:link>
              <g:link controller="mesto">
									<g:message code="tisa.mesto.name.pl"/>
							</g:link>
							<g:link controller="rezervace">
									<g:message code="tisa.rezervace.name.pl"/>
							</g:link>
							<g:link controller="rozmisteni">
									<g:message code="tisa.rozmisteni.name.pl"/>
							</g:link>
							<g:link controller="zpusobVyprseniRezervace">
									<g:message code="tisa.zpusobVyprseniRezervace.name.pl"/>
							</g:link>
							<g:link controller="poradatel">
									<g:message code="tisa.poradatel.name.pl"/>
                                                        </g:link>
							<g:link controller="spravce">
									<g:message code="tisa.spravce.name.pl"/>
							</g:link>
                                                        <g:link controller="uzivatel">
									<g:message code="tisa.uzivatel.name.pl"/>
							</g:link>
                                                        <g:link controller="operatorka">
									<g:message code="tisa.operatorka.name.pl"/>
							</g:link>
                                                        <g:link controller="kategorie_mist">
									<g:message code="tisa.kategorie_mist.name.pl"/>
							</g:link>
                                                        <g:link controller="kategorie_akci">
									<g:message code="tisa.kategorie_akci.name.pl"/>
							</g:link>
					</span>
			</div>			
			
			<div class="nav">
            <span class="menuButton"><g:link class="create" action="create"><g:message code="tisa.admin.create"/></g:link></span>
            <span class="menuButton"><g:link class="list" action="list"><g:message code="tisa.admin.list"/></g:link></span>
			</div>
			
			
      <g:layoutBody />		
    </body>	
</html>