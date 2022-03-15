var chartDataString = decodeHtml(chartData); // chartData comes from home.html
var chartJsonArray = JSON.parse(chartDataString);

var arrayLength = chartJsonArray.length;

var numericData = [];
var labelData = [];

for(var i=0; i < arrayLength; i++){
	numericData[i] = chartJsonArray[i].value;
	labelData[i] = chartJsonArray[i].label;
}

const labels = labelData;

 const data = {
   labels: labels,
   datasets: [{
	   label: "Project Status",
	   data: numericData,
	   backgroundColor: [
		   'rgb(77, 121, 255)',
		   'rgb(255, 204, 0)',
		   'rgb(224, 224, 235)'
		   ],

       borderWidth: 1
   }]
 };

 const config = {
   type: 'pie',
   data: data,
   options: {
	   title: {
		   display: true,
		   text: "Project Statuses",
	   }
   }
 };

var myPieChart = new Chart(
		document.getElementById("myPieChart"),
		config
);

function decodeHtml(html){
	var text = document.createElement("textarea");
	text.innerHTML = html;
	return text.value;
}
