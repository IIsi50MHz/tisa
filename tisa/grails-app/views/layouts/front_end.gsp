<html>
    <head>
        <title><g:layoutTitle default="Grails" /></title>
        <link rel="stylesheet" href="${createLinkTo(dir:'css',file:'main.css')}" />
        <link rel="shortcut icon" href="${createLinkTo(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
        <g:layoutHead />
        <g:javascript library="application" />				
    </head>
    <body>
				<span id="user_line">
					Nejsi přihlášen | <g:link controller="admin">administrovat</g:link>
				</span>
        <div id="spinner" class="spinner" style="display:none;">
            <img src="${createLinkTo(dir:'images',file:'spinner.gif')}" alt="Spinner" />
        </div>	
        <div id="logo">
					<a class="home" href="${createLinkTo(dir:'')}">
						<h1>TiSa</h1>
					</a>
				</div>	
				
			<div class="nav">
					<span class="menuButton">
							<g:link controller="front_akce">
									<g:message code="tisa.AkceController.name.pl"/>
							</g:link>
							<g:link controller="front_misto">
									<g:message code="tisa.MistoController.name.pl"/>
							</g:link>
					</span>
			</div>			
			
			
        <g:layoutBody />		
    </body>	
</html>