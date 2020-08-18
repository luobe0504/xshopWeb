


window.onload=function(){
	lay2=document.getElementById("show_lay2");
	T=setInterval('ff()',10);
	circle=document.getElementsByClassName("circle");
	for(var j=0;j<circle.length;j++){
	circle[j].style.top=350-(j*30)+"px";
	circle[j].style.left=950+(j*30)+"px";
	}
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
