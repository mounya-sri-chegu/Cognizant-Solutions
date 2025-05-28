
function addEvent(eventsArray, event) {
  eventsArray.push(event);
}

function registerUser(event) {
  if (event.seats > 0) event.seats--;
}

function filterEventsByCategory(events, category) {
  return events.filter(e => e.category === category);
}

function categoryCounter(category) {
  let count = 0;
  return function () {
    count++;
    return `${category}: ${count} registrations`;
  };
}

function dynamicSearch(events, callback) {
  return events.filter(callback);
}
