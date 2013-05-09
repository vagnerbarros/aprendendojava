<%@page import="java.util.List"%>
<%@page import="masterfila.util.Constants"%>
<%@ include file="topo_escolha_cidade.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MasterFila - In�cio</title>
<script type="text/javascript" src="js/paginate.js"></script>
<link href="css/style.css" rel="stylesheet" />
<link href="css/style_paginas.css" rel="stylesheet" />
</head>
<body>
	
	<div class="content_busca" style="height: 10px;">
	</div>

	<div class="limite">
		
		<div class="escolha_cidade_left">
			
			<img alt="" src="css/img/banner_inicio.png" width="400"/>
			
			<br/>
			
			<div class="content_leve_o_master">
			
			<p><strong>Leve o Master Fila para sua empresa!</strong></p>
			
			<a href="">Clique aqui e Conhe�a</a>
			
			<div class="clr"></div>
			
			</div>
			
			
		</div>
		
		<div class="escolha_cidade_right">
			
			<h2>.: Acesse o Master Fila :.</h2>
			
			<form class="form_cidade" action="home.jsp">
			
			<label>Selecione o Estado:</label>
			
			<select name="estados">
				<%
				String [] estados = Constants.listaEstados;
				for(String estado : estados){ %>
			    <option value="<%=estado %>"><%=estado %></option>
			    <% } %>
			</select>
			
			<label>Selecione a Cidade:</label>
			
			<select name="cidades">
				<option value="caruaru">Caruaru</option>
			</select>
			
			<input type="submit" value="ACESSAR o MasterFila"/>
			
		</form>
		
			
		</div>
				
		<div class="clr"></div>
				
	</div>

</body>
</html>

<%@ include file="rodape.jsp"%>