import { PrevNextCircleButton } from "./UIElements";
import "./Calendar.css";
import DayFlow from "./DayFlow";

//TODO: implement logic to get current week
const currWeek = "April 28-May 4";

export function Calendar() {
    return (
        <div className="calendarContainer">
            <Header></Header>
            <WeekView></WeekView>
        </div>
    );
}

function Header() {
    return (
        <WeekToggle></WeekToggle>
    );
}

function WeekToggle() {

    return (
        <div className="weekToggleContainer">
            <PrevNextCircleButton pointsLeft={true}></PrevNextCircleButton>
            <a style={{ margin: "1dvi" }}>{currWeek}</a>
            <PrevNextCircleButton pointsLeft={false}></PrevNextCircleButton>
        </div>
    );
}

function WeekView() {
    return (
        <div className="week">
            <div className="day">
                <a>Sunday</a>
                <DayFlow></DayFlow>
            </div>
            <div className="day">
                <a>Monday</a>
                <DayFlow></DayFlow>
            </div>
            <div className="day">
                <a>Tuesday</a>
                <DayFlow></DayFlow>
            </div>
            <div className="day">
                <a>Wednesday</a>
                <DayFlow></DayFlow>
            </div>
            <div className="day">
                <a>Thursday</a>
                <DayFlow></DayFlow>
            </div>
            <div className="day">
                <a>Friday</a>
                <DayFlow></DayFlow>
            </div>
            <div className="day">
                <a>Saturday</a>
                <DayFlow></DayFlow>
            </div>
        </div>
    );
}