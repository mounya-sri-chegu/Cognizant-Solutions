function greetUser(name = "Guest") {
  return `Welcome, ${name}`;
}

const event = { name: "Meetup", date: "2025-08-01", seats: 30 };
const { name, date } = event;

const original = [{ a: 1 }, { b: 2 }];
const clone = [...original];
