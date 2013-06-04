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
					
					<label class="wh160">Login:</label>
					<label class="wh160">Senha:</label>
					<input type="text" name="login" class="wh150"/>
					<input type="password" name="senha" class="wh150"/>
					<input type="submit" value="Confirmar" />
					<input type="hidden" value="logar" name="acao"/>
					<a href="cadastro.jsp">Cadastre-se </a> <a>|</a>
					<a href="esqueci_senha.jsp"> Esqueci a Senha</a>
					
					
				</form>
			<%
			}
			else{ %>
				<h2>Bem Vindo <%=u.getNome() %></h2>
				
				<div class="clr"></div>
				
			<% } %>
		
		<div class="clr"></div>
		
</div>