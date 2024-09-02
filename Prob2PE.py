# Lista de direcciones IP 
servers = ['192.168.1.1', '0.0.0.1', '192.168.1.2']  

# Función para hacer ping a un servidor
def ping_server(server):
    response = os.popen(f"ping -c 4 {server}").read()
    if "4 received" in response:
        latency = response.split("rtt min/avg/max/mdev = ")[1].split('/')[1]
        return latency, True
    else:
        return None, False
