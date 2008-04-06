

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>Edit Spravce</title>
    </head>
    <body>
        <div class="body">
            <h1>Spravce ${fieldValue(bean:spravce,field:'cele_jmeno')}</h1>
						<ul>
							<li>email: ${fieldValue(bean:spravce,field:'email')}</li>
							<li>telefon: ${fieldValue(bean:spravce,field:'telefon')}</li>
							<li>adresa: <p>${fieldValue(bean:spravce,field:'adresa')}</p></li>
							<li>hlavní správce: <b><g:message code="tisa.user.allrights.${spravce?.vsechna_prava}"/></b></li>
						</ul>
        </div>
    </body>
</html>
