<%@ include file="topo.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MasterFila - Início</title>
<script type="text/javascript" src="js/paginate.js"></script>

<link href="css/style.css" rel="stylesheet" />
<link href="css/style_paginas.css" rel="stylesheet" />

<script type="text/javascript">
	$(document).ready(function() {
		$('#content_paginate').pajinate({
			num_page_links_to_display : 3,
			items_per_page : 4
		});
	});
</script>

<script src="js/jquery.maskedinput-1.3.min.js"></script>

<script type="text/javascript" src="js/script_cadastro.js"></script>

<script language= "JavaScript">
	setTimeout("document.location = 'index.jsp'",1000);
</script>

</head>
<body>
	
	<%@ include file="componente_localizar_empresa.jsp"%>
	
	<%@ include file="menu.jsp"%>
	
	<div class="limite wh700">
			
			<div class="div_quadro_sucesso">
				
				<h3>Cadastro Realizado com Sucesso!</h3>
				
				<h4>Aguarde...</h4>
				
			</div>
			
			<div class="clr"></div>
		
	</div>

</body>
</html>

<%@ include file="rodape.jsp" %>