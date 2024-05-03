import React from 'react';
import logo from './logo.svg';
import './App.css';
import { Calendar } from './Calendar';
import { PrevNextCircleButton } from './UIElements';

function App() {
  return (
    <div className="App">
      <Calendar></Calendar>
      <p>
        Edit <code>src/App.tsx</code> and save to reload.
      </p>
    </div>
  );
}



export default App;
