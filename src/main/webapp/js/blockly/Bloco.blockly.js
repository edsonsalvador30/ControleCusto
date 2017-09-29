window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco = window.blockly.js.blockly.Bloco || {};

var item, var2;

/**
 * Bloco
 */
window.blockly.js.blockly.Bloco.Executar = function() {
	var2 = window.cronapi.xml.newXMLElement('familia', '');
	window.cronapi.xml.addXMLElement(var2, window.cronapi.xml.newXMLElement(
			'filho1', 'teste'));
	window.cronapi.xml.addXMLElement(var2, window.cronapi.xml.newXMLElement(
			'filho2', 'teste2'));
	window.alert(window.cronapi.xml.XMLDocumentToText(var2));
}
