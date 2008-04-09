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
       <div class="logo">
					<g:link controller="front_end">
						<img style="border:0" src="${createLinkTo(dir:'images',file:'grails_logo.jpg')}" alt="Grails" />
					</g:link>
				</div>	
			
                        
			<div class="nav">
					<span class="menuButton">
                                          (starý panel, co půjde už brzo pryč)
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

                                          <g:link action="list" controller="frontAkce">
					  (zobrazit všechny akce)				
                                          </g:link>
                                     
                                        </span>
			</div>
                        
                        <div class="nav"> 
                                        <span class="menuButton">
                                          Akce ve městech: 
                                                                                   
                                          <g:each in="${Mesto.list()}" status="i" var="mesto">
                                            <g:link controller="frontAkce" action="ukaz_mesto" id="${mesto.id}">
                                                 ${mesto.jmeno.encodeAsHTML()}
                                            </g:link>
                                          </g:each>

                                          <g:link action="list" controller="frontMisto">
					  (zobrazit všechna místa)				
					  </g:link>
                                     
                                        </span>
			</div>
                                              
			
        <g:layoutBody />		
    </body>	
</html>

