<html>
    <head>
        <title> Tisa Administrace <g:layoutTitle default="" /></title>
        <link rel="stylesheet" href="${createLinkTo(dir:'css',file:'admin.css')}" />
        <link rel="shortcut icon" href="${createLinkTo(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
        <g:layoutHead />
        <g:javascript library="application" />				
    </head>
    <body>
        <div id="spinner" class="spinner" style="display:none;">
            <img src="${createLinkTo(dir:'images',file:'spinner.gif')}" alt="Spinner" />
        </div>	
        <div class="logo"><img src="${createLinkTo(dir:'images',file:'grails_logo.jpg')}" alt="Grails" /></div>	
				
			<div class="nav">
					<span class="menuButton">
							<g:link controller="akce">
									<g:message code="tisa.AkceController.name.pl"/>
							</g:link>
							<g:link controller="misto">
									<g:message code="tisa.MistoController.name.pl"/>
							</g:link>
							<g:link controller="rezervace">
									<g:message code="tisa.RezervaceController.name.pl"/>
							</g:link>
							<g:link controller="rozmisteni">
									<g:message code="tisa.RozmisteniController.name.pl"/>
							</g:link>
							<g:link controller="zpusob_vyprseni_rezervace">
									<g:message code="tisa.Zpusob_vyprseni_rezervaceController.name.pl"/>
							</g:link>
					</span>
			</div>
				
				
        <g:layoutBody />		
    </body>	
</html>