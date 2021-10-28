import React,{Component} from "react";
import CropService from "../services/CropService";

class ListCropComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
                crops: []
        }
        this.addCrop = this.addCrop.bind(this);
        this.editCrop = this.editCrop.bind(this);
        this.deleteCrop = this.deleteCrop.bind(this);
    }

    deleteCrop(id){
        CropService.deleteCrop(id).then( res => {
            this.setState({crops: this.state.crops.filter(crop => crop.id !== id)});
        });
    }
    /*viewCrop(id){
        this.props.history.push(`/view-crop/${id}`);
    }*/
    editCrop(id){
        this.props.history.push(`/update-crop/${id}`);
    }

    componentDidMount(){
        CropService.getCrops().then((res) => {
            this.setState({ crops: res.data});
        });
    }

    addCrop(){
        this.props.history.push('/add-crop/_add');
    }

    render() {
        return (
            <div>
                 <h2 className="text-center">Crop List</h2>
                 <div className = "row">
                    {/*<button className="btn btn-primary" onClick={this.addCrop}> Add Crop</button>*/}
                 </div>
                 <br></br>
                 <div className = "row">
                        <table className = "table table-striped table-bordered">

                            <thead>
                                <tr>
                                    <th> cropType</th>
                                    <th> cropName</th>
                                    <th> quantity</th>
                                    <th> price</th>
                                    <th> Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    this.state.crops.map(
                                        crop => 
                                        <tr key = {crop.id}>
                                             <td> {crop.cropType} </td>   
                                             <td> {crop.cropName}</td>
                                             <td> {crop.quantity}</td>
                                             <td> {crop.price}</td>
                                             <td>
                                                {/* <button onClick={ () => this.editCrop(crop.id)} className="btn btn-info">Update crop </button>
                                                 <button style={{marginLeft: "10px"}} onClick={ () => this.deleteCrop(crop.id)} className="btn btn-danger">Delete crop</button>*/}
                                                 <button style={{marginLeft: "10px"}} onClick={ () => this.viewCrop(crop.id)} className="btn btn-info">View </button>
                                             </td>
                                        </tr>
                                    )
                                }
                            </tbody>
                        </table>

                 </div>

            </div>
        )
    }
}

export default ListCropComponent;