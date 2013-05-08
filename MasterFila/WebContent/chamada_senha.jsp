<%@ include file="topo.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MasterFila - Início</title>
<script type="text/javascript" src="js/paginate.js"></script>
<link href="css/style.css" rel="stylesheet" />

<script type="text/javascript">  

	/*

    var variaveis =location.search.split("?");
    var id_fila = variaveis[1].split("=");
    
    $(document).ready(function(){  
        
        setInterval(carregar, 2000);  // Executa a função carregar a cada meio segundo.   

        function carregar(){
           $.ajax({              
                  type: 'post', // O tipo de requisição
                  data: 'function=carregar', // Variáveis que serão passadas pro script Server Inside.
                  url: 'arquivos_filas/'+id_fila[1]+'.php',
                  success: function(retorno){ //Caso o script obtenha sucesso ele carreda no #pannel as informações.
                    $('#content').html(retorno); 				
                  }
             });         
        } 
        
    });  
    */
    </script>  

</head>
<body>
	
	<script type="text/javascript">
	</script>
	
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
		
		<div class="content_chamada_senhas">
				
			<div class="quadro_chamadas_estatistica">
				
				<div class="quadro_chamada_atual">
					
					<h2>Última Chamada de Senha</h2>
					
					<span class="desc_empresa">
					<strong>Empresa:</strong> EMPRESA 0	
					<br/>
					<strong>Endereço:</strong> Endereço do Estabelecimento - S/N - Centro
					</span>
					
					<span class="content_senha">
					SENHA<br/>
					P5683
					</span>
					
					<span class="content_guiche">
					GUICHÊ<br/>
					15
					</span>
					
					<span class="data_chamada">Data: 17/04/2013 - Horário Chamada: 10:37 AM</span>
					
					<div class="clr"></div>
				</div>
				
				<div class="quadro_estatistica">
					
					<h2>Estatísticas de Chamada</h2>
					
					Quadro de Estatísticas					
					
					<div class="clr"></div>
				</div>
				
			</div>
			
			<div class="quadro_historico">
				
				<h2>Histórico (5 Últimas)</h2>
				
				<%  
					for (int i=0; i<5; i++){
				%>
				
				<span class="content_senha">
				SENHA<br/>
				P5683
				</span>
					
				<span class="content_guiche">
				GUICHÊ<br/>
				15
				</span>
				
				<%
					}
				%>
				
			</div>
			
			<div class="clr"></div>
			
		</div>
		
		<div class="clr"></div>
			
	</div>
	
	<div class="clr"></div>
	
	<br/>
		
</body>
</html>

<%@ include file="rodape.jsp"%>
