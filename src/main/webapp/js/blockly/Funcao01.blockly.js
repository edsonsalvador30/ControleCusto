window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Funcao01 = window.blockly.js.blockly.Funcao01 || {};

var param01;

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Funcao01.Controle_de_Tempo = function() {
	if (param01 <= window.cronapi.dateTime.getNow()) {
		window.alert('Atingiu o tempo limite para entrega do livro.');
	}
}
