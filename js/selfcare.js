//need an array for each type of picture: mental, physical, physical, fun
//each picture will have 7 array values
//same thing for the text changing at the bottom
//one array of 7 values for the weekdays, another array of 7 values for the list

//first function: changing all of the elements when the specific day button is pressed
document.getElementById("Monday").addEventListener("click", mondayClicked);
document.getElementById("Tuesday").addEventListener("click", tuesdayClicked);
document.getElementById("Wednesday").addEventListener("click", wednesdayClicked);
document.getElementById("Thursday").addEventListener("click", thursdayClicked);
document.getElementById("Friday").addEventListener("click", fridayClicked);
document.getElementById("Saturday").addEventListener("click", saturdayClicked);
document.getElementById("Sunday").addEventListener("click", sundayClicked);

//mental images array
var mental;
mental = [
									"../img/mental0.jpg",
									"../img/mental1.jpg",
									"../img/mental2.jpg",
									"../img/mental3.jpg",
									"../img/mental4.jpg",
									"../img/mental5.jpg",
									"../img/mental6.jpg",
								];


var mentalPicture = document.getElementById("mental");
var physicalPicture = document.getElementById("physical");
var socialPicture = document.getElementById("social");
var funPicture = document.getElementById("fun");

function mondayClicked()
{
	//all the 0 values in the arrays are for Monday
	//change all the pictures first
	mentalPicture.src = mental[0];
	socialPicture.src = social[0];
	physicalPicture.src = physical[0];
	funPicture.src = fun[0];

	//change text elements at bottom
	document.getElementById("days").innerHTML = days[0];
	document.getElementById("items").innerHTML = items[0];
}

function tuesdayClicked()
{
	//all the 0 values in the arrays are for Monday
	//change all the pictures first
	document.getElementById("mental").src = mental[1].src;
	document.getElementById("social").src = social[1].src;
	document.getElementById("physical").src = physical[1].src;
	document.getElementById("fun").src = fun[1].src;

	//change text elements at bottom
	document.getElementById("days").innerHTML = days[1];
	document.getElementById("items").innerHTML = items[1];
}

function wednesdayClicked()
{
	//all the 0 values in the arrays are for Monday
	//change all the pictures first
	document.getElementById("mental").src = mental[2].src;
	document.getElementById("social").src = social[2].src;
	document.getElementById("physical").src = physical[2].src;
	document.getElementById("fun").src = fun[2].src;

	//change text elements at bottom
	document.getElementById("days").innerHTML = days[2];
	document.getElementById("items").innerHTML = items[2];
}

function thursdayClicked()
{
	//all the 0 values in the arrays are for Monday
	//change all the pictures first
	document.getElementById("mental").src = mental[3].src;
	document.getElementById("social").src = social[3].src;
	document.getElementById("physical").src = physical[3].src;
	document.getElementById("fun").src = fun[3].src;

	//change text elements at bottom
	document.getElementById("days").innerHTML = days[3];
	document.getElementById("items").innerHTML = items[3];
}

function fridayClicked()
{
	//all the 0 values in the arrays are for Monday
	//change all the pictures first
	document.getElementById("mental").src = mental[4].src;
	document.getElementById("social").src = social[4].src;
	document.getElementById("physical").src = physical[4].src;
	document.getElementById("fun").src = fun[4].src;

	//change text elements at bottom
	document.getElementById("days").innerHTML = days[4];
	document.getElementById("items").innerHTML = items[4];
}

function saturdayClicked()
{
	//all the 0 values in the arrays are for Monday
	//change all the pictures first
	document.getElementById("mental").src = mental[5].src;
	document.getElementById("social").src = social[5].src;
	document.getElementById("physical").src = physical[5].src;
	document.getElementById("fun").src = fun[5].src;

	//change text elements at bottom
	document.getElementById("days").innerHTML = days[5];
	document.getElementById("items").innerHTML = items[5];
}

function sundayClicked()
{
	//all the 0 values in the arrays are for Monday
	//change all the pictures first
	document.getElementById("mental").src = mental[6].src;
	document.getElementById("social").src = social[6].src;
	document.getElementById("physical").src = physical[6].src;
	document.getElementById("fun").src = fun[6].src;

	//change text elements at bottom
	document.getElementById("days").innerHTML = days[6];
	document.getElementById("items").innerHTML = items[6];
}

//social images array
const social = [" ", " ", " ", " ", " ", " ", " "];
social[0].src = "../img/social0.jpg";
social[1].src = "../img/social1.jpg";
social[2].src = "../img/social2.jpg";
social[3].src = "../img/social3.jpg";
social[4].src = "../img/social4.jpg";
social[5].src = "../img/social5.jpg";
social[6].src = "../img/social6.jpg";

//physical images array
const physical = [" ", " ", " ", " ", " ", " ", " "];
physical[0].src = "../img/physical0.jpg";
physical[1].src = "../img/physical1.jpg";
physical[2].src = "../img/physical2.jpg";
physical[3].src = "../img/physical3.jpg";
physical[4].src = "../img/physical4.jpg";
physical[5].src = "../img/physical5.jpg";
physical[6].src = "../img/physical6.jpg";

//fun images array
const fun = [" ", " ", " ", " ", " ", " ", " "];
fun[0].src = "../img/fun0.jpg";
fun[1].src = "../img/fun1.jpg";
fun[2].src = "../img/fun2.jpg";
fun[3].src = "../img/fun3.jpg";
fun[4].src = "../img/fun4.jpg";
fun[5].src = "../img/fun5.jpg";
fun[6].src = "../img/fun6.jpg";

//text arrays
//days array
const days = [" ", " ", " ", " ", " ", " ", " "];
days[0] = "Monday";
days[1] = "Tuesday";
days[2] = "Wednesday";
days[3] = "Thursday";
days[4] = "Friday";
days[5] = "Saturday";
days[6] = "Sunday";

//items array
const items = [" ", " ", " ", " ", " ", " ", " "];
items[0] = "Monday self care options are to sleep in until 9am, eat a balanced dinner at a dining hall, draw with friends, or listen to a funny podcast.";
items[1] = "Tuesday self care options are to meet up with a friend for lunch, listen to a new music album, read a new book, or do thirty minutes of yoga.";
items[2] = "Wednesday self care options are to do laundry for the week, play video games with friends, clean the whole house, or work on personal art.";
items[3] = "Thursday self care options are to go to bed early after work, buy a cool drink at the cafe, get early dinner at a dining hall (plus soft serve), or make small talk with classmates about weekend plans.";
items[4] = "Friday self care options are to hang out with friends and do whatever, plan assignments for the coming week, eat out at a restaurant, or go on a scenic bike ride.";
items[5] = "Saturday self care options are to sleep in/spend the morning in bed, go for a walk on local trails, start any big assignments, or tune into a favorite show or stream.";
items[6] = "Sunday self care options are get necessary groceries for the week, do any dishes from the weekend, make a fancier dinner to have leftovers, or play a favorite game alone.";


var twelveHourTime;
twelveHourTime = true;

function clock()
{
	// document.getElementById("year").innerHTML = "2016";

	var today;
	today = new Date();

	var year;
	year = today.getFullYear();
	//console.log(year);

	var month;
	month = today.getMonth();
	//console.log(month);

	var monthOfTheYear;
	monthOfTheYear = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'];

	var date;
	date = today.getDate();
	//console.log(date);

	var day;
	day = today.getDay();
	//console.log(day);

	var dayOfTheWeek;
	dayOfTheWeek = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];


	var hour;
	hour = today.getHours();
	//console.log(hour);

	var minute;
	minute = today.getMinutes();
	//console.log(minute);

	document.getElementById("year").innerHTML = year;
	document.getElementById("month").innerHTML = monthOfTheYear[month];
	document.getElementById("date").innerHTML = date;
	document.getElementById("day").innerHTML = dayOfTheWeek[day];

	if(twelveHourTime == true){


		if(hour >= 12)
		{
			document.getElementById("meridiem").innerHTML = "pm";
		}

		else
		{
			document.getElementById("meridiem").innerHTML = "am";
		}

		if(hour > 12)
		{
			hour = hour - 12;
		}


	}

	else
	{
		document.getElementById("meridiem").innerHTML = "mil";
	}



	if(minute < 10)
	{
		minute = "0" + minute;
	}

	document.getElementById("hour").innerHTML = hour;
	document.getElementById("minute").innerHTML = minute;

}

clock();
setInterval(clock, 10);
