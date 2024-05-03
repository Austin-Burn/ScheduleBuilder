import "./DayFlow.css";

export default function DayFlow() {

const items = [];

  for (let i = 0; i < 24; i++) {
    items.push(
        <div key={i} className="hourunit">
            <div className="start timeunit"></div>
            <div className="middle timeunit"></div>
            <div className="middle timeunit"></div>
            <div className="end timeunit"></div>
        </div>
    );
  }

  return (
    <div className="dayContainer">
      {items}
    </div>
  );
}