
jQuery.konami = function(fn, code) {
	// ↑ ↑ ↓ ↓ ← → ← → B A
	code = code || [83, 78, 79, 87];

	//snow = 83, 78, 79, 87

	var i = 0;

	$(document).keydown(function(e) {
		let char = typeof code === 'string' ? String.fromCharCode(e.which).toLowerCase() : e.which;
		i = char === code[i] ? i + 1 : 0;
		if (i === code.length) {
			fn();
			i = 0;
		}
	});
};

$.konami(function() {
	alert('Woohoo!');
});

$.konami(function() {
	alert('Woohoo!');
}, 'foo');