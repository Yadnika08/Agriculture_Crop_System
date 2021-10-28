import React,{Component} from "react";
import CropService from "../services/CropService";

class ViewCropComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.match.params.id,
            crop: []
        }
    }

    componentDidMount(){
        CropService.getCropById(this.state.id).then( res => {
            this.setState({crop: res.data});
        })
    }

    render() {
        return (
            <div>
                <br></br>
                <div className = "card col-md-6 offset-md-3">
                    <h3 className = "text-center"> View Crop Details</h3>
                    <div className = "card-body">
                        <div className = "row">
                            <label> Crop Type: </label>
                            <div> { this.state.crop.cropType }</div>
                        </div>
                        <div className = "row">
                            <label> cropName: </label>
                            <div> { this.state.crop.cropName }</div>
                        </div>
                        <div className = "row">
                            <label> Quantity: </label>
                            <div> { this.state.crop.quantity }</div>
                        </div>
                        <div className = "row">
                            <label> Price: </label>
                            <div> { this.state.crop.Price }</div>
                        </div>
                    </div>

                </div>
            </div>
        )
    }
}

export default ViewCropComponent;