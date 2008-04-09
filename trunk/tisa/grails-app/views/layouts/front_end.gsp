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
								${ session.user.cele_jmeno } 
								(<g:message code="tisa.${ session.user.class.getName().toLowerCase() }.name.sg" />),
								<g:link controller="admin" action="logout"><g:message code="tisa.user.logout" /></g:link> | 
						</g:if>
						<g:else>
								<g:message code="tisa.user.not_logged" />, <g:link action="uzivatel_login" controller="frontUzivatel"><g:message code="tisa.user.login"/></g:link>,  
                                                                <g:link action="create" controller="frontUzivatel"><g:message code="tisa.user.go_registration"/></g:link>
                                                                 nebo
						</g:else>
					<g:link controller="admin"><g:message code="tisa.user.go_admin"/></g:link>					
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
                                                        <g:link controller="frontKategorieAkci">
									<g:message code="tisa.kategorieAkci.name.pl"/>
							</g:link>
							<g:link controller="frontKategorieMist">
									<g:message code="tisa.kategorieMist.name.pl"/>
							</g:link>
					</span>
			</div>
                        
                        
                        <div class="nav"> 
                                        <span class="menuButton">
                                          Hledat kulturní akce: 
                                                                                   
                                          <g:each in="${KategorieAkci.list()}" status="i" var="kategorieAkci">
                                            <g:link controller="frontAkce" action="ukaz_kategorii" id="${kategorieAkci.id}">
                                                 ${kategorieAkci.nazev.encodeAsHTML()}
                                            </g:link>
                                          </g:each>
                                     
                                        </span>
			</div>
                        
                        <div class="nav"> 
                                        <span class="menuButton">
                                          Akce ve městech: 
                                                                                   
                                          <g:each in="${Mesto.list()}" status="i" var="mesto">
                                            <g:link controller="frontAkce" action="list">
                                                 ${mesto.jmeno.encodeAsHTML()}
                                            </g:link>
                                          </g:each>
                                     
                                        </span>
			</div>
			
			
        <g:layoutBody />		
    </body>	
</html>

