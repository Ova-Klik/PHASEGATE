// Admin.jsx
import { useState } from "react";

export default function Admin() {
  const [qr, setQr] = useState("");

  const generateQR = async () => {
    const res = await fetch("http://localhost:5000/start-attendance");
    const data = await res.json();
    setQr(data.qr);
  };

  return (
    <div className="min-h-screen flex flex-col items-center justify-center bg-white">
      <button
        onClick={generateQR}
        className="bg-primary text-white px-6 py-3 rounded-lg"
      >
        Start Attendance
      </button>

      {qr && (
        <img src={qr} alt="QR Code" className="mt-6 w-60" />
      )}
    </div>
  );
}
