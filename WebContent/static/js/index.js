


window.onload=function(){
	lay2=document.getElementById("show_lay2");
	T=setInterval('ff()',10);
	circle=document.getElementsByClassName("circle");
	for(var j=0;j<circle.length;j++){
	circle[j].style.top=350-(j*30)+"px";
	circle[j].style.left=950+(j*30)+"px";
	}
	r=lay2.getBoundingClientRect();
	menu.style.top=r.top+"px";
	menu.style.left=r.left+"px";
	m=menu.getBoundingClientRect();
	showItem.style.top=m.top+"px";
	showItem.style.left=m.right+"px";
}
var i=0;
function ff(){
	lay2.scrollLeft=i;
/*	circle[i/1200].style.backgroundColor="#0f0";*/
	i+=1;
	if(i==3601)
		i=0;
}
function  showImg(x){
	i=(x-1)*1200;
	
	lay2.scrollLeft=i;
	/*circle[x-1].style.backgroundColor="#0f0";
	for(var z=0;z<circle.length;z++){
		if(z!=(x-1)){
			circle[x-1].style.backgroundColor="#ccc";
		}
	}*/
}
function showItems(x,y){
	if(x==1){
		showItem.style.display="block";
		var xhr=new XMLHttpRequest();
		xhr.open("get","goodstype?action=selectItem&id="+y);
		xhr.send();
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4 && xhr.status==200){
				var data= xhr.responseText;
				data=JSON.parse(data);
				for(var xb in data){
					var d1=document.createElement("div");
					
				}
			}
		}
	}else if(x==2){
		showItem.style.display="none";
	}
}
