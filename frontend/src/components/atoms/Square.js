const Square = ({number, color}) => {
    const squareStyle = {
        backgroundColor: color, // Use the provided color as the background color
        width: '100px', // Adjust width and height as needed
        height: '100px',
        display: 'flex',
        justifyContent: 'center',
        alignItems: 'center',
        border: '1px solid black', 
    };

    return (
        <div style={squareStyle}>
            {number}
        </div>
    );
}

export default Square;