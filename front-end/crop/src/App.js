

import './App.css';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import CreateCropComponent from './components/CreateCropComponent';
import ListCropComponent from './components/ListCropComponent';
import UpdateCropComponent from './components/UpdateCropComponent';
import ViewCropComponent from './components/CreateCropComponent';
function App() {
  return (
    <div className="App">
      <Router>
              
                <div className="container">
                    <Switch> 
                          <Route path = "/" exact component = {ListCropComponent}></Route>
                          <Route path = "/crop" component = {ListCropComponent}></Route>
                          <Route path = "/add-crop/:id" component = {CreateCropComponent}></Route>
                          {/*<Route path = "/view-crop/:id" component = {ViewCropComponent}></Route>*/}
                           <Route path = "/update-crop/:id" component = {UpdateCropComponent}></Route> 
                    </Switch>
                </div>
              
        </Router>
    </div>
  );
}

export default App;