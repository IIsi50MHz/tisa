<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.rozmisteni.edit"/></title>
				<script type="text/javascript" src="${createLinkTo(dir:'js',file:'ext-base.js')}"></script>
				<script type="text/javascript" src="${createLinkTo(dir:'js',file:'ext-all.js')}"></script>
				<script language="javascript" src="${createLinkTo(dir:'js',file:'rozmisteni.js')}"></script>
				<style type="text/css">
				.r_editor .first {
					clear:both;
				}
				.r_editor div {
					width:1.2em;
					height:1.2em;
					border:1px solid white;
					background-color:#ddd;
					float:left;
					margin:0;
				}
				.r_toolbar .color {
					border-top
				}
				div.seat { background-color:#0f0; }
				div.stage { background-color:#f00; }
				div.door { background-color:#00f; }
			</style>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.rozmisteni.edit"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${rozmisteni}">
            <div class="errors">
                <g:renderErrors bean="${rozmisteni}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" action="update" >
                <input type="hidden" name="id" value="${rozmisteni?.id}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="nazev">Nazev:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rozmisteni,field:'nazev','errors')}">
                                    <input type="text" id="nazev" name="nazev" value="${fieldValue(bean:rozmisteni,field:'nazev')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="plan_salu">Plansalu:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rozmisteni,field:'plan_salu','errors')}">
                                    <!--input type="hidden" value="${fieldValue(bean:rozmisteni,field:'plan_salu')}"/-->
																		<div id="plan_salu_editor">
																				<!--input type="hidden" id="plan_salu" name="plan_salu" class="plan_salu" name="rozmisteni" value='{"0":{"1":" ","2":" ","3":" ","4":" ","5":" ","6":" ","7":" ","8":" ","9":" ","10":" ","11":" ","12":" ","13":" ","14":" ","15":" ","16":" ","17":" ","18":" ","19":" "},"1":{"1":" ","2":" ","3":" ","4":" ","5":" ","6":" ","7":" ","8":" ","9":" ","10":" ","11":" ","12":" ","13":" ","14":" ","15":" ","16":" ","17":" ","18":" ","19":" "},"2":{"1":" ","2":" ","3":" ","4":" ","5":" ","6":" ","7":" ","8":" ","9":" ","10":" ","11":" ","12":" ","13":" ","14":" ","15":" ","16":" ","17":" ","18":" ","19":" "},"3":{"1":" ","2":" ","3":" ","4":" ","5":" ","6":" ","7":" ","8":" ","9":" ","10":" ","11":" ","12":" ","13":" ","14":" ","15":" ","16":" ","17":" ","18":" ","19":" "},"4":{"1":" ","2":" ","3":" ","4":" ","5":" ","6":"door","7":" ","8":" ","9":" ","10":" ","11":" ","12":"door","13":"door","14":" ","15":" ","16":" ","17":" ","18":" ","19":" "},"5":{"1":" ","2":" ","3":" ","4":"door","5":"door","6":"door","7":"door","8":" ","9":" ","10":" ","11":"door","12":"door","13":"door","14":"door","15":" ","16":" ","17":" ","18":" ","19":" "},"6":{"1":" ","2":" ","3":" ","4":"door","5":"door","6":" ","7":"door","8":" ","9":" ","10":" ","11":"door","12":" ","13":"door","14":" ","15":" ","16":" ","17":" ","18":" ","19":" "},"7":{"1":" ","2":" ","3":" ","4":" ","5":"door","6":"door","7":"door","8":" ","9":" ","10":" ","11":"door","12":"door","13":"door","14":" ","15":" ","16":" ","17":" ","18":" ","19":" "},"8":{"1":" ","2":" ","3":" ","4":" ","5":" ","6":" ","7":" ","8":" ","9":" ","10":" ","11":" ","12":" ","13":" ","14":" ","15":" ","16":" ","17":" ","18":" ","19":" "},"9":{"1":" ","2":" ","3":" ","4":" ","5":" ","6":" ","7":" ","8":" ","9":"stage","10":" ","11":" ","12":" ","13":" ","14":" ","15":" ","16":" ","17":" ","18":" ","19":" "},"10":{"1":" ","2":" ","3":" ","4":" ","5":" ","6":" ","7":" ","8":"stage","9":"stage","10":"stage","11":" ","12":" ","13":" ","14":" ","15":" ","16":" ","17":" ","18":" ","19":" "},"11":{"1":" ","2":" ","3":"seat","4":" ","5":" ","6":" ","7":" ","8":"stage","9":" ","10":"stage","11":" ","12":" ","13":" ","14":" ","15":" ","16":" ","17":" ","18":" ","19":" "},"12":{"1":" ","2":" ","3":"seat","4":"seat","5":" ","6":" ","7":" ","8":"stage","9":"stage","10":"stage","11":" ","12":" ","13":" ","14":" ","15":"seat","16":" ","17":" ","18":" ","19":" "},"13":{"1":" ","2":" ","3":" ","4":"seat","5":"seat","6":" ","7":" ","8":" ","9":" ","10":" ","11":" ","12":" ","13":" ","14":"seat","15":"seat","16":" ","17":" ","18":" ","19":" "},"14":{"1":" ","2":" ","3":" ","4":" ","5":"seat","6":"seat","7":" ","8":" ","9":" ","10":" ","11":" ","12":"seat","13":"seat","14":"seat","15":" ","16":" ","17":" ","18":" ","19":" "},"15":{"1":" ","2":" ","3":" ","4":" ","5":" ","6":"seat","7":"seat","8":"seat","9":" ","10":" ","11":"seat","12":"seat","13":" ","14":" ","15":" ","16":" ","17":" ","18":" ","19":" "},"16":{"1":" ","2":" ","3":" ","4":" ","5":" ","6":" ","7":" ","8":"seat","9":"seat","10":"seat","11":"seat","12":" ","13":" ","14":" ","15":" ","16":" ","17":" ","18":" ","19":" "},"17":{"1":" ","2":" ","3":" ","4":" ","5":" ","6":" ","7":" ","8":" ","9":" ","10":" ","11":" ","12":" ","13":" ","14":" ","15":" ","16":" ","17":" ","18":" ","19":" "},"18":{"1":" ","2":" ","3":" ","4":" ","5":" ","6":" ","7":" ","8":" ","9":" ","10":" ","11":" ","12":" ","13":" ","14":" ","15":" ","16":" ","17":" ","18":" ","19":" "},"19":{"1":" ","2":" ","3":" ","4":" ","5":" ","6":" ","7":" ","8":" ","9":" ","10":" ","11":" ","12":" ","13":" ","14":" ","15":" ","16":" ","17":" ","18":" ","19":" "}}' /-->
																				<input type="hidden" id="plan_salu" name="plan_salu" class="plan_salu" value='${fieldValue(bean:rozmisteni,field:'plan_salu')}' />
																		</div>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="misto">Misto:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rozmisteni,field:'misto','errors')}">
                                    <g:select optionKey="id" from="${Misto.list()}" name="misto.id" value="${rozmisteni?.misto?.id}" ></g:select>
                                </td>
                            </tr> 
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:actionSubmit class="save" value="${message(code:'tisa.update')}" /></span>
<span class="button"><g:actionSubmit class="delete" onclick="return confirm('${message(code:'tisa.are_you_sure')}');" value="${message(code:'tisa.delete')}" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
