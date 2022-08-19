FROM debian

#ENV TERM=

# RUN cos && cos - uruchamia w jednym obrazie
# RUN cos; RUN cos - uruchamia w roznych obrazach
RUN apt-get update && apt-get install -y openssh-server sudo

# jakis bug w przy starcie sshd, wiec taki fix
RUN mkdir -p /run/sshd

# useradd: -m (tworzy katalog domowy), -s (sh/bash), -G (group)
RUN useradd -m -s /bin/bash -G sudo michal && \
	echo "michal:michal" | chpasswd

RUN service ssh start

EXPOSE 22

# Run ssh daemon
CMD ["/usr/sbin/sshd", "-D"]


# docker build -t zad3_ssh_deb  - build
# docker run -d -p 2022:22 zad3_ssh_deb  - run (daemon)
# ssh michal@localhost -p 2022
