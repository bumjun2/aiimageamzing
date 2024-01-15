import React, {useEffect, useState} from 'react';
import axios from 'axios';

function App() {
    const [data, setData] = useState('');

    useEffect(() => {
        axios.get('http://localhost:8888/api/example')
            .then(response =>
                setData(response.data)
            )
            .catch(error => console.error(error));
    }, []);

    return (
        <div>
            <h1>안녕{data}</h1>
        </div>
    );
}

export default App;