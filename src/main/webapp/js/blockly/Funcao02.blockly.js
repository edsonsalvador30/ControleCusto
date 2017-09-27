window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Funcao02 = window.blockly.js.blockly.Funcao02 || {};

var item;

/**
 * Funcao02
 */
window.blockly.js.blockly.Funcao02.Executar = function() {
	item = window.cronapi.screen.getValueOfField("");
	window.alert(item);
}
