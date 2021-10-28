import React, { useState, useEffect } from "react";
import { Link, useParams } from "react-router-dom";
import axios from "axios";

const User = () => {
  const [user, setUser] = useState({
    UserName: "",
    EmailId: "",
    PhoneNumber: "",

  });
  const { id } = useParams();
  useEffect(() => {
    loadUser();
  }, []);
  const loadUser = async () => {
    const res = await axios.get(`http://localhost:8094/dealers/{DealerId}`);
    setUser(res.data);
  };
  return (
    <div className="container py-4">
      <Link className="btn btn-primary" to="/">
        back to dealers
      </Link>
      <h1 className="display-4">User Id: {id}</h1>
      <hr />
      <ul className="list-group w-50">
        <li className="list-group-item">user name: {user.UserName}</li>
        <li className="list-group-item">email: {user.EmailId}</li>
        <li className="list-group-item">phone: {user.PhoneNumber}</li>
      </ul>
    </div>
  );
};

export default User;