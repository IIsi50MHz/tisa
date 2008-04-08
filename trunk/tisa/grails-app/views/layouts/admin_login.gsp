<html>
    <head>
        <title>Tisa Admin</title>
        <link rel="stylesheet" href="${createLinkTo(dir:'css',file:'admin.css')}" />
        <link rel="shortcut icon" href="${createLinkTo(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
        <g:layoutHead />
        <g:javascript library="application" />				
    </head>
    <body>
				<span id="user_line">
						<g:if test="${session.user}">								
								${ session.user.cele_jmeno } 
								(<g:message code="tisa.${ session.user.class.getName().toLowerCase() }.name.sg" />),
								<g:link controller="admin" action="logout"><g:message code="tisa.user.logout" /></g:link> | 
						</g:if>
						<g:else>
								<g:message code="tisa.user.not_logged" />,
						</g:else>
					<g:link controller="front_end"><g:message code="tisa.user.go_front_end"/></g:link>					
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
							<g:link action="spravce_login">
									<g:message code="tisa.spravce.login"/>
							</g:link>
							<g:link action="operatorka_login">
									<g:message code="tisa.operatorka.login"/>
							</g:link>
					</span>
			</div>
				
      <g:layoutBody />		
    </body>	
</html>
