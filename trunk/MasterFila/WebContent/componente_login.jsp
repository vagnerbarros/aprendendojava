<%@page import="masterfila.entidade.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="masterfila.util.Constants"%>

<div class="content_login">
		
		<%
			Usuario u = (Usuario) session.getAttribute("usuario");
			if(u == null){
			%>
				
				<h2>.: Área do cliente :.</h2>
				
				<div class="clr"></div>
				
				<form action="controlador" method="POST" class="form_login"> 
					
					<label>Login:</label>
					<label>Senha:</label>
					<input type="text" name="login"/>
					<input type="password" name="senha"/>
					<input type="submit" value="Confirmar" >
					<input type="hidden" value="logar" name="acao">
					<a href="">Esqueci a Senha</a>
					
				</form>
			<%
			}
			else{ %>
				<h2>Bem Vindo <%=u.getNome() %></h2>
				
				<div class="clr"></div>
				
			<% } %>
		
		<div class="clr"></div>
		
</div>