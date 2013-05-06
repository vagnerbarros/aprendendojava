<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="SHORTCUT ICON" href="icon.ico" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style_topo.css" rel="stylesheet" />
<link rel="stylesheet" href="themes/base/jquery.ui.all.css">
<script src="ui/jquery-1.7.2.js"></script>
<script src="external/jquery.bgiframe-2.1.2.js"></script>
<script src="ui/jquery.ui.core.js"></script>
<script src="ui/jquery.ui.widget.js"></script>
<script src="ui/jquery.ui.position.js"></script>
<script src="ui/jquery.ui.dialog.js"></script>
	
<script type="text/javascript">
			$(function(){

				// Dialog
				$('#dialog').dialog({
					modal: true,
					autoOpen: false,
					height:300,
					width:400
				});

				// Dialog Link
				$('#dialog_link').click(function(){
					$('#dialog').dialog('open');
					return false;
				});

				//hover states on the static widgets
				$('ul#icons li').hover(
					function() { $(this).addClass('ui-state-hover'); },
					function() { $(this).removeClass('ui-state-hover'); }
				);

			});
		</script>

</head>
<body>
	
	<!-- ui-dialog -->
	<div id="dialog" title="Alterar Cidade">
    	
    	<div class="left_escolha_cidade">
    	
		<form class="form_cidade">
			
			<label>Selecione o Estado:</label>
			
			<select name="estados">
			    <option value="AC">Acre</option>
			    <option value="AL">Alagoas</option>
			    <option value="AM">Amazonas</option>
			    <option value="AP">Amapá</option>
			    <option value="BA">Bahia</option>
			    <option value="CE">Ceará</option>
			    <option value="DF">Distrito Federal</option>
			    <option value="ES">Espirito Santo</option>
			    <option value="GO">Goiás</option>
			    <option value="MA">Maranhão</option>
			    <option value="MG">Minas Gerais</option>
			    <option value="MS">Mato Grosso do Sul</option>
			    <option value="MT">Mato Grosso</option>
			    <option value="PA">Pará</option>
			    <option value="PB">Paraíba</option>
			    <option value="PE">Pernambuco</option>
			    <option value="PI">Piauí</option>
			    <option value="PR">Paraná</option>
			    <option value="RJ">Rio de Janeiro</option>
			    <option value="RN">Rio Grande do Norte</option>
			    <option value="RO">Rondônia</option>
			    <option value="RR">Roraima</option>
			    <option value="RS">Rio Grande do Sul</option>
			    <option value="SC">Santa Catarina</option>
			    <option value="SE">Sergipe</option>
			    <option value="SP">São Paulo</option>
			    <option value="TO">Tocantins</option>
			</select>
			
			<label>Selecione a Cidade:</label>
			
			<select name="cidades">
			    <option value="Caruaru">Caruaru</option>
			</select>
			
			<input type="submit" value="Alterar Cidade"/>
			
		</form>
		
		</div>
		
		<div class="right_escolha_cidade">
			
			<img alt="" src="css/img/logo_form.png" width="70"/>
						
		</div>
		
	</div>
	
	<header>
	
		<div class="limite">
			
			<div class="left_topo">
				<img alt="" src="css/img/logo.png" height="95"/>
			</div>
			
			<div class="right_topo">
				
				<h2>Acessar a Área do cliente</h2>
				
				<div class="clr"></div>
				
				<form action="" class="form_login"> 
					
					<label>Login:</label>
					<label>Senha:</label>
					<input type="text"/>
					<input type="password"/>
					<input type="submit" value="Confirmar" >
					<a href="">Esqueci a Senha</a>
					
				</form>
			</div>
			
		</div>
	
	</header>
	
	<div class="limite">
		<div class="content_cidade_selecionada">
			<h6>Você está em:</h6>
			<h4>Caruaru - PE</h4>
			<a href="index.jsp" id="dialog_link">Alterar Cidade</a>
		</div>
	</div>
		
</body>
</html>