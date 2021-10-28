import axios from 'axios';

const CROP_API_BASE_URL = "http://localhost:8095/api/crop";

class CropService {

    getCrops(){
        return axios.get(CROP_API_BASE_URL);
    }

    createCrop(crop){
        return axios.post(CROP_API_BASE_URL, crop);
    }

    getCropById(id){
        return axios.get(CROP_API_BASE_URL + '/' + id);
    }

    updateCrop(crop, id){
        return axios.put(CROP_API_BASE_URL + '/' + id, crop);
    }

    deleteCrop(id){
        return axios.delete(CROP_API_BASE_URL + '/' + id);
    }
}

export default new CropService()