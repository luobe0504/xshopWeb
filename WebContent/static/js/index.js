
window.onload = function() {
	lay2 = document.getElementById("show_lay2");
	T = setInterval('ff()', 10);
	circle = document.getElementsByClassName("circle");
	for (var j = 0; j < circle.length; j++) {
		circle[j].style.top = 350 - (j * 30) + "px";
		circle[j].style.left = 950 + (j * 30) + "px";
	}
	r = lay2.getBoundingClientRect();
	menu.style.top = r.top + "px";
	menu.style.left = r.left + "px";
	m = menu.getBoundingClientRect();
	showItem.style.top = m.top + "px";
	showItem.style.left = m.right + "px";
}
var i = 0;
function ff() {
	lay2.scrollLeft = i;
	/* circle[i/1200].style.backgroundColor="#0f0"; */
	i += 1;
	if (i == 3601)
		i = 0;
}
function showImg(x) {
	i = (x - 1) * 1200;

	lay2.scrollLeft = i;
	/*
	 * circle[x-1].style.backgroundColor="#0f0"; for(var z=0;z<circle.length;z++){
	 * if(z!=(x-1)){ circle[x-1].style.backgroundColor="#ccc"; } }
	 */
}
function showItems(x, y) {
	if (x == 1) {
		showItem.style.display = "block";
		var xhr = new XMLHttpRequest();
		xhr.open("get", "goodstype?action=selectItem&id=" + y);
		xhr.send();
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				var data = xhr.responseText;
				data = JSON.parse(data);
				while(showItem.children.length>0){
				showItem.removeChild(showItem.children[0]);
			}
				for ( var xb in data) {
					
				var goodstype=data[xb];
				console.log(goodstype);
					var d1 = document.createElement("div");
					
					d1.addEventListener("mouseover",function(){
						showItems(1,y);
					})
					
					
					d1.style.width = "60px";
					d1.style.height = "80px";
					d1.style.float = "left";
					d1.style.backgroundColor = "#666";
					var d1_pic = document.createElement("div");
					d1_pic.style.margin = "auto";
					d1_pic.style.width = "50px";
					d1_pic.style.height = "60px";
					d1.appendChild(d1_pic);
					var zhref=document.createElement("a");
					zhref.href="goods?action=selectcidLike & id="+goodstype.gtid;
					
					var img = document.createElement("img");
					img.src = goodstype.gtpic;
					img.style.width = "50px";
					img.style.height = "50px";
					img.style.paddingTop="5px";
					zhref.appendChild(img);
					d1_pic.appendChild(zhref);
					var d1_name = document.createElement("div");
					d1_name.innerHTML=goodstype.gtname;
					d1_name.style.width="60px";
					d1_name.style.height="20px";
					d1_name.style.textAlign="center";
					d1_name.style.lineHeight="20px";
					d1_name.style.fontSize="12px";
					d1.appendChild(d1_name);
					showItem.appendChild(d1);
				}
			}
		}
	} else if (x == 2) {
		showItem.style.display = "none";
		d1.addEventListener("mouseout",function(){
			showItems(2);
		})
		/*while(showItem.children.length>0){
			showItem.removeChild(showItem.children[0]);
		}*/
	}
}
