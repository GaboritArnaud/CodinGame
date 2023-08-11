import { useState, useEffect } from 'react';
import Select from 'react-select'
import {Button} from '../component/button/button'

import { addProblem, findAllProblemToDo } from './service';

import './problem.scss'

export function Problem() {
  const [selectedProblem, setSelectedProblem] = useState(null)
  const [problems, setProblems] = useState([]);
  const [loading, setLoading] = useState(true);

  const fetchProblems = async () => {
    findAllProblemToDo()
      .then(resp => resp.json())
      .then(data => {
        console.log("count", data.length)
        console.log("data", data)
        setProblems(data)
        setLoading(false)
      })
  }

  useEffect(() => {
      fetchProblems();
  }, []);

  const getProblemsOptions = () => {
    console.log("test", problems)
    return problems.map(problem => ({value: problem.id, label: problem.title}))
  }

  const handleOnClick = () => {
    console.log("click ajouter", selectedProblem)
    addProblem(selectedProblem);
  }

  return (
    <div className='problem-content'>
      <div className='problem-form'>
        <label>
          Choix du problem :
          <Select 
            options={getProblemsOptions()}
            onChange={(select) => setSelectedProblem(select.value)}
          />
        </label>
        <Button className="validate" onClick={handleOnClick} disabled={loading} value="Ajouter">
          
        </Button>
      </div>
      <div>
        {selectedProblem 
          ? <p>Problem selectionné : {selectedProblem}</p>
          : <p>Aucun problem selectionné</p>
        }
      </div>
    </div>
    
  );
}
