using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {
        int bandera = 0;
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void txtCentigrados_TextChanged(object sender, EventArgs e)
        {
            try
            {
                if (bandera == 0)
                {
                    txtFarenheit.Text = (( (Convert.ToDouble(txtCentigrados.Text))* 9/5) + 32).ToString("N2") + " °F";
                }
            }
            catch
            {
                if (bandera == 0)
                {
                    txtFarenheit.Text = "";
                }
            }
        }

        private void txtFarenheit_TextChanged(object sender, EventArgs e)
        {
            try
            {
                if (bandera == 1)
                {
                    txtCentigrados.Text = ((Convert.ToDouble(txtFarenheit.Text) - 32) * 5/9).ToString("N2")+" °C";
                }
            }
            catch
            {
                if (bandera == 1)
                {
                    txtCentigrados.Text = "";
                }
            }
            
        }

        private void txtFarenheit_MouseEnter(object sender, EventArgs e)
        {
            bandera = 1;
        }

        private void txtCentigrados_MouseEnter(object sender, EventArgs e)
        {
            bandera = 0;
        }

        private void txtCentigrados_Enter(object sender, EventArgs e)
        {
            bandera = 0;
        }

        private void txtFarenheit_Enter(object sender, EventArgs e)
        {
            bandera = 1;
        }
    }
}
