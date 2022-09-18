
var os = require('os');
exports.getIp = function(){

	let IPAddress = '';
	//네트워크 주소가 할당된 네트워크 인터페이스를 포함하는 개체를 반환합니다.
	var interfaces = os.networkInterfaces();

	for(var devName in interfaces){
		var iface = interfaces[devName];

		for(var i = 0; i<iface.length; i++){
			var alias = iface[i];
			if(alias.family==='IPv4'&&alias.address !=='127.0.0.1'&& !alias.internal){
				IPAddress = alias.address;
			}
		}
	}
	return IPAddress;
};