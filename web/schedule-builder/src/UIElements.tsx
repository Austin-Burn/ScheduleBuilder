import { ReactComponent as ChevronLeft } from "./chevron_left.svg";
import { ReactComponent as ChevronRight } from "./chevron_right.svg";
import "./UIElements.css";

export function PrevNextCircleButton({ pointsLeft }: { pointsLeft: boolean}) {
    
    if (pointsLeft) {
        return (
            <div className="arrowButton">
                <ChevronLeft></ChevronLeft>
            </div>
        );
    } else {
        return (
            <div className="arrowButton">
                <ChevronRight></ChevronRight>
            </div>
        );
    }

};