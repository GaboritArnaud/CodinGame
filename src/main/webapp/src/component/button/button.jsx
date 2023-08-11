import {React} from 'react';

import './button.scss';

export function Button({value, className, ...rest}) {

    return (
        <button type="button" className={`button ${className}`} {...rest}>
            <div>{value}</div>
        </button>
    );
}