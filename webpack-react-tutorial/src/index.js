import React, {Component} from 'react';
import ReactDOM from 'react-dom';
import { hot } from 'react-hot-loader/root';
import { DatePicker } from "@atlaskit/datetime-picker";
//const Hot = hot(TutorialTimePicker);

export default class TutorialTimePicker extends Component {
    render() {
        return (
            <div>
                <h3>Date Time Picker for test1</h3>
                <DatePicker
                    id="datepicker"
                    onChange={console.log}
                    testId={'datePicker'}
                />
            </div>
        )
    }
}

AJS.toInit(function () {
    ReactDOM.render(<TutorialTimePicker />, document.getElementById("container"));
})