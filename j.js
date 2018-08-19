var s,a,q=0,j,l,c;
function f1()
{
var val=document.getElementById("app1").innerHTML;
if(val==0)
{
document.getElementById("app1").innerHTML='1';
document.getElementById("p1").innerHTML='240';
}

else
{
var val=document.getElementById("app1").innerHTML;
val++;
var p1=val*240;
document.getElementById("p1").innerHTML=p1;
document.getElementById("app1").innerHTML=val;
}
}


function f2()
{
var val=document.getElementById("app2").innerHTML;
if(val==0)
{
document.getElementById("app2").innerHTML='1';
document.getElementById("p2").innerHTML='300';
}

else
{
var val=document.getElementById("app2").innerHTML;
val++;
var p2=val*300;
document.getElementById("p2").innerHTML=p2;
document.getElementById("app2").innerHTML=val;
}
}

function f3()
{
var val=document.getElementById("app3").innerHTML;
if(val==0)
{
document.getElementById("app3").innerHTML='1';
document.getElementById("p3").innerHTML='280';
}

else
{
var val=document.getElementById("app3").innerHTML;
val++;
var p3=val*280;
document.getElementById("p3").innerHTML=p3;
document.getElementById("app3").innerHTML=val;
}
}

function f4()
{
var val=document.getElementById("app4").innerHTML;
if(val==0)
{
document.getElementById("app4").innerHTML='1';
document.getElementById("p4").innerHTML='200';
}

else
{
var val=document.getElementById("app4").innerHTML;
val++;
var p4=val*200;
document.getElementById("p4").innerHTML=p4;
document.getElementById("app4").innerHTML=val;
}
}

function f5()
{
var val=document.getElementById("app5").innerHTML;
if(val==0)
{
document.getElementById("app5").innerHTML='1';
document.getElementById("p5").innerHTML='150';
}

else
{
var val=document.getElementById("app5").innerHTML;
val++;
var p5=val*150;
document.getElementById("p5").innerHTML=p5;
document.getElementById("app5").innerHTML=val;
}
}

function add1()
{
var sum1=0,sum2=0,sum3=0,sum4=0,sum5=0;
var sum;
var val=document.getElementById("app1").innerHTML;
var sum1=val*240;
var val=document.getElementById("app2").innerHTML;
var sum2=val*300;
var val=document.getElementById("app3").innerHTML;
var sum3=val*280;
var val=document.getElementById("app4").innerHTML;
var sum4=val*200;
var val=document.getElementById("app5").innerHTML;
var sum5=val*150;
sum=sum1+sum2+sum3+sum4+sum5;

document.getElementById("i1").value=sum;
}

function a()
{
s=document.getElementById("i1").value;
localStorage.setItem("lastname", s);
}

function b()
{
var temp,k,u,result,a=0;
var v=localStorage.getItem("lastname");
var newItem = document.createElement("LI");
var textnode = document.createTextNode(v);
 newItem.appendChild(textnode);
 var list = document.getElementById("t");
list.insertBefore(newItem, list.childNodes[0]);
}