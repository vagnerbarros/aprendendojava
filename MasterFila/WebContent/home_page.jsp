<%@page import="masterfila.dominio.Categoria"%>

<jsp:include page="topo.jsp" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MasterFila - In�cio</title>
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
</head>
<body>
	
	<div class="content_busca">
		<div class="limite">
			<form action="" class="form_busca">
				<input type="text" id="txt_busca"
					placeholder=".: Pesquise por uma empresa aqui :." maxlength="100" />
				<input type="submit" value="Pesquisar">
			</form>
		</div>
	</div>

	<div class="limite">

		<div class="limite_lista_categorias">

			<h4>Categorias</h4>
			
			<%
			String [] categorias = Categoria.getCategorias();
			for(String categoria : categorias){
			%>

			<ul class="lista_categorias primeira_lista">
				<li><a> <img alt=""
						src="css/img/icons/icon_consultorios.png" height="25" />
						<%=categoria %>
				</a></li>
			</ul>
			
			<%} %>

			<div class="clr"></div>

		</div>

	</div>
	
	<div class="limite">

		<div class="listagem_empresas">

			<h6>Categoria Selecionada:</h6>
			<h4>Ag�ncias Banc�rias</h4>
			
			<br/>
			
			<div id="content_paginate" class="container">
				<div class="page_navigation"></div>
				<ul class="content lista_empresas_paginate">
					
					<%
						for(int i=0;i<16;i++){
					%>
					
					<li>
						<img alt="" src="img_empresas/img_empresa_default.png"/>
						<p>
							<strong>Nome da Empresa:</strong>
							<br/>
							EMPRESA <%out.print(i); %>
							<br/>
							<strong class="esp_top">Endere�o:</strong>
							<br/>
							Endere�o do Estabelecimento - S/N - Centro 
						</p>
						<a class="bg_image_azul_pad�o" href="chamada_senha.jsp?id_fila=098987872">Visualizar</a>
					</li>
					
					<%} %>
										
					

				</ul>
				
				<div class="clr"></div>
				
			</div>

		</div>
	
	<br/>
		
	</div>

</body>
</html>

<jsp:include page="rodape.jsp" />