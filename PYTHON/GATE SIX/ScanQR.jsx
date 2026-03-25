// ScanQR.jsx
import { QrReader } from "react-qr-reader";
import { useState } from "react";

export default function ScanQR() {
  const [result, setResult] = useState("");

  const handleScan = async (data) => {
    if (data) {
      setResult(data);

      await fetch("http://localhost:5000/mark-attendance", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ qrData: data })
      });
    }
  };

  return (
    <div className="min-h-screen bg-white flex flex-col items-center justify-center">
      <h2 className="text-xl text-primary mb-4">Scan QR Code</h2>

      <div className="w-80">
        <QrReader
          constraints={{ facingMode: "environment" }}
          onResult={(result) => {
            if (result) handleScan(result?.text);
          }}
        />
      </div>

      {result && <p className="mt-4 text-green-600">Scanned!</p>}
    </div>
  );
}
