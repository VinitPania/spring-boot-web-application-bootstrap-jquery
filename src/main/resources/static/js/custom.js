alert("I'm active");

const params = new Proxy(new URLSearchParams(window.location.search), {
	  get: (searchParams, prop) => searchParams.get(prop),
	});
	
	let value = params.id; 
	alert(value);
	
	alert("I'm queryString");
	