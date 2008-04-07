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
						<g:if test="${session.user}">
								${ session.user.cele_jmeno }, <g:link controller="admin" action="logout"><g:message code="tisa.user.logout" /></g:link> | 
						</g:if>
						<g:else>
								<g:message code="tisa.user.not_logged" />,
						</g:else>
					<g:link controller="front_end"><g:message code="tisa.user.go_front_end"/></g:link>					
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
							<g:link controller="frontAkce">
									<g:message code="tisa.akce.name.pl"/>
							</g:link>
							<g:link controller="frontMisto">
									<g:message code="tisa.misto.name.pl"/>
							</g:link>
					</span>
			</div>			
			
			
        <g:layoutBody />		
    </body>	
</html>