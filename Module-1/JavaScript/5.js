function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}

Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};

const e = new Event("Dance Workshop", "2025-07-10", 25);
console.log(Object.entries(e));