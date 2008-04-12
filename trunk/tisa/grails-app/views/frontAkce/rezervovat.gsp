<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="front_end" />
        <title><g:message code="tisa.rezervace.rezervovat"/></title>
				<style>
					.plan_salu {
						line-height:0;
					}
					.plan_salu div, .plan_salu input {
						display:block;
						float:left;
						background-color:#ddd;
						width:1.5em;
						height:1.5em;
						margin:1px;
					}
					.plan_salu .taken {
							background-color:orange;
					}
					.plan_salu .stage {
							background-color:red;
					}
					.plan_salu .door {
							background-color:blue;
					}
				</style>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.rezervace.show"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${rezervace}">
            <div class="errors">
                <g:renderErrors bean="${rezervace}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="rezervovat" controller="frontAkce" id="${rezervace?.akce?.id}">
            <div class="dialog">
                <table>
                    <tbody>
                        <tr class="prop">
                            <td valign="top" class="name">Akce:</td>
                            <td valign="top" class="value">
																<g:link controller="akce" action="show" id="${rezervace?.akce?.id}">${rezervace?.akce?.nazev}</g:link>
														</td>
                        </tr>
                        
                        <tr class="prop">
                            <td valign="top" class="name">Uzivatel:</td>
                            <td valign="top" class="value"><g:link controller="uzivatel" action="show" id="${rezervace?.uzivatel?.id}">${rezervace?.uzivatel?.cele_jmeno}</g:link></td>
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Mista:</td>
                            <td valign="top" class="value">
																<div class="plan_salu">
																<g:each var="row" status="r" in="${plan}">
																		<g:each var="cell" status="c" in="${row}">
																				<g:if test="${cell=='seat'}">
																						<input type="checkbox" name="seat[${r}_${c}]" />
																				</g:if>
																				<g:else>
																					<g:if test="${cell!='e'}">
																						<g:if test="${cell=='checked'}">
																								<input type="checkbox" name="seat[${r}_${c}]" checked="checked" />
																						</g:if>
																						<g:else>
																								<div class="${cell}"></div>
																						</g:else>
																					</g:if>
																					<g:else>
																						<div></div>
																					</g:else>
																				</g:else>
																		</g:each>
																		<br style="clear:both"/>
																</g:each>
																</div>
														</td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                    <input type="hidden" name="id" value="${rezervace?.id}" />
                    <span class="button"><g:actionSubmit class="save" value="${message(code:'tisa.rezervace.reserve')}" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
