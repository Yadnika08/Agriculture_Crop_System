import React, { Component } from 'react'
import CropService from '../services/CropService';

class CreateCropComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.match.params.id,
            cropType: '',
            cropName: '',
            quantity: '',
            price:''
        }
        this.changeCropTypeHandler = this.changeCropTypeHandler.bind(this);
        this.changeCropNameHandler = this.changeCropNameHandler.bind(this);
        {/*this.changeQuantityHandler=this.changeQuantityHandler(this);
        this.changePriceHandler=this.changePriceHandler(this);*/}
        this.saveOrUpdateCrop = this.saveOrUpdateCrop.bind(this);
    }

    componentDidMount(){

         if(this.state.id === '_add'){
             return
         }else{
            CropService.getCropById(this.state.id).then( (res) =>{
                let crop = res.data;
                this.setState({
                    cropType:crop.cropType,
                    cropName: crop.cropName,
                    quantity : crop.quantity,
                    price:crop.price
                });
            });
        }        
    }
    saveOrUpdateCrop = (e) => {
        e.preventDefault();
        let crop = {cropType: this.state.cropType, cropName: this.state.cropName, quantity: this.state.quantity,price:this.state.price};
        console.log('crop => ' + JSON.stringify(crop));

        if(this.state.id === '_add'){
            CropService.createCrop(crop).then(res =>{
                this.props.history.push('/crop');
            });
        }else{
            CropService.updateCrop(crop, this.state.id).then( res => {
                this.props.history.push('/crop');
            });
        }
    }
    
    changeCropTypeHandler= (event) => {
        this.setState({cropType: event.target.value});
    }

    changeCropNameHandler= (event) => {
        this.setState({cropName: event.target.value});
    }

   changeQuantityHandler= (event) => {
        this.setState({quantity: event.target.value});
    }
    changePriceHandler=(event)=> {
        this.setState({price:event.target.value});
    }

    cancel(){
        this.props.history.push('/crop');
    }

    getTitle(){
        if(this.state.id === '_add'){
            return <h3 className="text-center">Add Crop</h3>
        }else{
            return <h3 className="text-center">Update Crop</h3>
        }
    }
    render() {
        return (
            <div>
                <br></br>
                   <div className = "container">
                        <div className = "row">
                            <div className = "card col-md-6 offset-md-3 offset-md-3">
                                {
                                    this.getTitle()
                                }
                                <div className = "card-body">
                                    <form>
                                        <div className = "form-group">
                                            <label> Crop Type: </label>
                                            <input placeholder="Crop Type" name="cropType" className="form-control" 
                                                value={this.state.cropType} onChange={this.changeCropTypeHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> Crop Name: </label>
                                            <input placeholder="Crop Name" name="cropName" className="form-control" 
                                                value={this.state.cropName} onChange={this.changeCropNameHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> Quantity: </label>
                                            <input placeholder="Quantity of crop available" name="quantity" className="form-control" 
                                                value={this.state.quantity} onChange={this.changeQuantityHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> Price: </label>
                                            <input placeholder="price per kg" name="price" className="form-control" 
                                                value={this.state.price} onChange={this.changePriceHandler}/>
                                        </div>

                                        <button className="btn btn-success" onClick={this.saveOrUpdateCrop}>Save</button>
                                        <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancel</button>
                                    </form>
                                </div>
                            </div>
                        </div>

                   </div>
            </div>
        )
    }
}

export default CreateCropComponent;