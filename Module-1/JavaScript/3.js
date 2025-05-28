const events = [
  { name: "Music Fest", date: "2025-06-25", seats: 10 },
  { name: "Book Club", date: "2024-05-01", seats: 0 }
];

events.forEach(event => {
  const isUpcoming = new Date(event.date) > new Date();
  const hasSeats = event.seats > 0;
  if (isUpcoming && hasSeats) {
    console.log(`${event.name} is available`);
  }
});

function register(event) {
  try {
    if (event.seats > 0) {
      event.seats--;
    } else {
      throw "No seats available";
    }
  } catch (error) {
    console.error(error);
  }
}