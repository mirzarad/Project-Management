const labels = [
    'NOT STARTED',
    'IN PROGRESS',
    'COMPLETED',
];

 const data = {
   labels: labels,
   datasets: [{
     label: 'My First dataset',
     backgroundColor: ['#3e95cd','#8e5ea2','#3cba9f'],
     borderColor: 'rgb(255, 99, 132)',
     data: [2, 10, 5],
   }]
 };

 const config = {
   type: 'pie',
   data: data,
   options: {}
 };

var myPieChart = new Chart(
		document.getElementById("myPieChart"),
		config
);
