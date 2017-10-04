var avaliacao = (function(){
	
	
	$('#containerAvaliadores').on('click', 'button.add', function(){
		
		var $linha = $(this).closest('tr');
		var $novaLinha = $linha.clone();
		
		$novaLinha.find('input').val(0);
		
		$linha.parent().append($novaLinha);
		
		validaVisualizacaoIcones($linha);
		
	});

	$('#containerAvaliadores').on('click', 'button.rem', function(){
		
		var $linha = $(this).closest('tr');
		$linha.remove();
		
		validaVisualizacaoIcones($linha);
		
	});
	
	
	var validaVisualizacaoIcones = function($linhaClicada){
		
		var $tbody = $linhaClicada.closest('tbody');
		var $primeiraLinha = $tbody.find('tr:first');
		
		$primeiraLinha.find('td:last').find('.rem').addClass('disabled');
		
	};
	
	
})();